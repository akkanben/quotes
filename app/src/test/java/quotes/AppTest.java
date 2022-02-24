/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_getquote_specific_quote() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuote(array, 1);
        assert(sut.equals("Ask no questions, and you'll be told no lies.\n" +
                "-- Charles Dickens"));
    }

    @Test
    void test_getquote_last_quote() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuote(array, array.length - 1);
        assert(sut.equals("办理明尼苏达大学双城分校毕业证|||||||微信Q：930083" +
                "900<<<<<;办理毕业证、办理成绩单、办理教育部学历认证、为留学生办理学历文凭、使馆留学回国人员证明、录取通知书、Off" +
                "er、在读证明、雅思托福成绩单、网上存档永久可查！专业面向“英国、加拿大、意大利，澳洲、新西兰、美国 ”等国的学历学位" +
                "真实教育部认证、使馆认证。专业办理国外各高校的毕业证，成绩单，长期专业为留学生解决毕业难的问题，【实体公司，值得信赖】\n" +
                "-- 办理明尼苏达大学双城分校毕业证[学历认证University of Minnesota Twin Cities"));
    }

    @Test
    void test_getquotearray_correct_size() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] sut = App.getQuotesArray(recentQuotesJSONFile);
        assert(sut.length == 138);
    }

    @Test
    void test_getquotebyauthor_pass() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuoteByAuthor(array, "Marilyn Monroe");
        assert(sut.endsWith("Marilyn Monroe"));
    }

    @Test
    void test_getquotebyauthor_fail() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuoteByAuthor(array, "potato");
        assert(sut.endsWith("Nothing found."));
    }

    @Test
    void test_getquotebyquotetext_pass() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuoteByQuoteText(array, "The stupid monkey.");
        assert(sut.endsWith("Richard Rider"));
    }

    @Test
    void test_getquotebyquotetext_fail() {
        File recentQuotesJSONFile = new File("./src/test/resources/recentquotes.json");
        Quote[] array = App.getQuotesArray(recentQuotesJSONFile);
        String sut = App.getQuoteByQuoteText(array, "this ONE is not ON the quote list");
        assert(sut.endsWith("Nothing found."));
    }
}
