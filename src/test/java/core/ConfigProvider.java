package core;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;

public interface ConfigProvider {
    Config conf = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

//    static Config readConfig() {
//        File configFile = new File("src/test/resources/application.conf");
//        if (!configFile.exists()) {
//            throw new RuntimeException("Файл конфігурації не знайдено: " + configFile.getAbsolutePath());
//        }
//        return ConfigFactory.parseFile(configFile).resolve();
//    }

    String URL_DEV = readConfig().getString("urls.url_dev");
    String URL_PROD = conf.getString("urls.url_prod");
    String URL_LOCAL = conf.getString("urls.url_local");
    String ACC_MAIN_LOGIN = conf.getString("usersParams.accMain.login");
    String ACC_MAIN_PASSWORD = conf.getString("usersParams.accMain.password");
    String ACC_ONE_LOGIN = conf.getString("usersParams.acc1.login");
    String ACC_ONE_PASSWORD = conf.getString("usersParams.acc1.password");
    String ACC_TWO_LOGIN = conf.getString("usersParams.acc2.login");
    String ACC_TWO_PASSWORD = conf.getString("usersParams.acc2.password");
    String ACC_THREE_LOGIN = conf.getString("usersParams.acc3.login");
    String ACC_THREE_PASSWORD = conf.getString("usersParams.acc3.password");
    String OBSERVER_LOGIN = conf.getString("usersParams.observer.login");
    String OBSERVER_PASSWORD = conf.getString("usersParams.observer.password");
    String PROD_ACC_LOGIN = conf.getString("usersParams.prodAcc.login");
    String PROD_ACC_PASSWORD = conf.getString("usersParams.prodAcc.password");
    String SHK_ACC_LOGIN = conf.getString("usersParams.shkAcc.login");
    String SHK_ACC_PASSWORD = conf.getString("usersParams.shkAcc.password");
    String SHK_ACC_EDRPOU = conf.getString("usersParams.shkAcc.edrpoy");
    String TEST2_ACC_LOGIN = conf.getString("usersParams.test2Acc.login");
    String TEST2_ACC_PASSWORD = conf.getString("usersParams.test2Acc.password");
    String DEMO9_ACC_LOGIN = conf.getString("usersParams.demo9Acc.login");
    String DEMO9_ACC_PASSWORD = conf.getString("usersParams.demo9Acc.password");
    String REM_ACC_LOGIN = conf.getString("usersParams.testRemovableAcc.login");
    String REM_ACC_PASSWORD = conf.getString("usersParams.testRemovableAcc.password");
    String REM_ACC_EDRPOY = conf.getString("usersParams.testRemovableAcc.edrpoy");
    String CHANGE_USER_EMAIL = conf.getString("testsEmail.changeUser.email");
    String NEW_USER_EMAIL = conf.getString("usersParams.newUser.login");
    String NEW_USER_PASSWORD = conf.getString("usersParams.newUser.password");
    String NEW_USER_EDRPOY = conf.getString("usersParams.newUser.edrpoy");
    String FACTOR_ACC_NAME = conf.getString("factorAccount.name");
    String FACTOR_ACC_PASSWORD = conf.getString("factorAccount.password");
    String FACTOR_URL = conf.getString("urls.url_factor");

    String ADMIN_PANEL_URL = conf.getString("urls.url_admin_panel");
    String ADMIN_PANEL_LOGIN = conf.getString("adminPanel.browserForm.login");
    String ADMIN_PANEL_PASSWORD = conf.getString("adminPanel.browserForm.password");
    String LARAVEL_LOGIN = conf.getString("adminPanel.laravelForm.login");
    String LARAVEL_PASSWORD = conf.getString("adminPanel.laravelForm.password");
    String ACC_MAIN_EDRPOY =conf.getString("usersParams.accMain.edrpoy");
}
