package setup.core.enums;

public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String value;

    BrowserType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BrowserType getBrowserType(String value){
        String lowerCaseValue = value.toLowerCase();
        switch (lowerCaseValue){
            case "chrome":
                return CHROME;
            case "firefox":
                return FIREFOX;
            default:
                throw new IllegalArgumentException("no "+value+" in enum");
        }
    }
}
