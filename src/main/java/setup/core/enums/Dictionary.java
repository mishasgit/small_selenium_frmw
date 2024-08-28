package setup.core.enums;

public enum Dictionary {
    ALPHANUMERIC("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    public String dictionary;

    Dictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public String getDictionary(){
        return this.dictionary;
    }

}
