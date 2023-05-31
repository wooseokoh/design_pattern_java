package Bridge;

public class MainEntry {
    public static void main(String[] args) {
        var title = "제목";
        var author = "나";
        String[] content = {
                "가나다라",
                "마바사",
                "아자"
        };

        Draft draft = new Draft(title,author,content);

        Display display1 = new SimpleDisplay();
        draft.print(display1);

        Display display2 = new CaptionDisplay();
        draft.print(display2);


        var publisher = "가나출판";
        var cost = 100;

        Publication publication = new Publication(title,author,content,publisher,cost);

        publication.print(display1);
    }
}
