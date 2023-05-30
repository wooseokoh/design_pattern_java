package Template;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        String title = "design pattern";

        ArrayList<String> content = new ArrayList<>();
        content.add("디자인");
        content.add("패턴");

        String footer = "2023.05.30 goot";

        Article article
                = new Article(title,content,footer);

        DisplayArticleTemplate template1 = new SimpleDisplayArticle(article);
        template1.display();

        System.out.println();

        DisplayArticleTemplate template2 = new CaptionDisplayArticle(article);
        template2.display();
    }
}
