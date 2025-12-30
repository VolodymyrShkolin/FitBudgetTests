package core.extensions;

import com.google.common.collect.ImmutableMap;
import core.ConfigProvider;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class AllureEnvironmentExtension implements BeforeAllCallback {

//    private static boolean initialized = false;
//
//    @Override
//    public synchronized void beforeAll(ExtensionContext context) {
//        if (initialized) return;
//
//        allureEnvironmentWriter(
//                ImmutableMap.<String, String>builder()
//                        .put("Platform", System.getProperty("os.name"))
//                        .put("Version", System.getProperty("os.version"))
//                        .put("Java", System.getProperty("java.version"))
//                        .put("Browser", "Chrome")
//                        .put("Context URL", ConfigProvider.URL_DEV)
//                        .build(),
//                "target/allure-results/"
//        );
//
//        initialized = true;
//    }
    private static final AtomicBoolean executed = new AtomicBoolean(false);

        @Override
        public void beforeAll(ExtensionContext context) {
            if (executed.compareAndSet(false, true)) {
                allureEnvironmentWriter(
                        ImmutableMap.<String, String>builder()
                                .put("Platform", System.getProperty("os.name"))
                                .put("Version", System.getProperty("os.version"))
                                .put("Java", System.getProperty("java.version"))
                                .put("Browser", "Chrome")
                                .put("Context URL", ConfigProvider.URL_DEV)
                                .build(),
                        "target/allure-results/"
                );
            }
        }

}

