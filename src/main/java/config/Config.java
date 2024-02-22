package config;

import org.json.simple.JSONObject;

import static libraries.JsonUtility.readJsonFile;

public class Config {
    public static  String globalConfigFilePath = "src/main/java/globalConfigData/Config.json";
    public static JSONObject globalTestDataOfEnv;
    public static  String env="qa";
    public static  String appUrl;
    public static  String userName;
    public static  String password;
    public static  String browserName= "chrome";
    public static String reportFilePath;
    public static String seleniumGridHubUrl;
    public Config(String env, String browserName){
        JSONObject globalTestData = (JSONObject) readJsonFile(globalConfigFilePath);
        globalTestDataOfEnv = (JSONObject) globalTestData.get(env.toLowerCase());
        appUrl = (String) globalTestDataOfEnv.get("APP_URL");
        userName = (String) globalTestDataOfEnv.get("User1_UserName");
        password = (String) globalTestDataOfEnv.get("User1_Password");
        reportFilePath = (String) globalTestData.get("Test_Report_Loc");
        seleniumGridHubUrl = (String) globalTestData.get("Selenium_Grid_Url");
    }

}