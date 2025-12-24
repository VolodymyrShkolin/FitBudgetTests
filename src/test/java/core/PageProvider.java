package core;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class PageProvider {
    private final WebDriver driver;
    private final Map<Class<?>, Object> pages = new HashMap<>();

    public PageProvider(WebDriver driver) {
        this.driver = driver;
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> pageClass) {
        return (T) pages.computeIfAbsent(pageClass, clazz -> {
            try {
                return clazz
                        .getDeclaredConstructor(WebDriver.class)
                        .newInstance(driver);
            } catch (Exception e) {
                throw new RuntimeException(
                        "Cannot create PageObject: " + clazz.getSimpleName(), e
                );
            }
        });
    }
}
