package quotes;

public class APIQuote {
    String quoteText;
    String quoteAuthor;
    String quoteLink;

    public APIQuote(String quoteText, String quoteAuthor, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.quoteLink = quoteLink;
    }

    public String toString() {
        return "APIQuote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }

    public Quote standardizeQuote() {
        return new Quote(quoteAuthor, quoteText);
    }
}