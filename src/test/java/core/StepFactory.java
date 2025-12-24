package core;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class StepFactory {
    private final WebDriver driver;
    private final PageProvider pages;

    private final Map<Class<?>, Object> cache = new HashMap<>();

    public StepFactory(WebDriver driver, PageProvider pages) {
        this.driver = driver;
        this.pages = pages;
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> stepClass) {

        if (cache.containsKey(stepClass)) {
            return (T) cache.get(stepClass);
        }

        try {
            T step = stepClass
                    .getDeclaredConstructor(WebDriver.class, PageProvider.class, StepFactory.class)
                    .newInstance(driver, pages, this);

            cache.put(stepClass, step);
            return step;

        } catch (Exception e) {
            throw new RuntimeException(
                    "Cannot create Step: " + stepClass.getSimpleName(), e
            );
        }
    }
}
