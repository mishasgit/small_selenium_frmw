package setup.core.enums;

public enum BaseUrl {

    PROD("https://www.shopltk.com/"),
    QA("");

    private String url;

    BaseUrl(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
