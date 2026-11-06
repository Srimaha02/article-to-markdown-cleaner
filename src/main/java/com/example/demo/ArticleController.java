package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ArticleController {

    @GetMapping("/clean")
    public String cleanArticle(@RequestParam String url) {
        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                    .timeout(15000)
                    .get();

            doc.select("script, style, nav, header, footer, aside, form, .ad, .ads, .sidebar").remove();

            StringBuilder markdown = new StringBuilder();

            Element titleElement = doc.select("h1").first();
            String title = (titleElement != null) ? titleElement.text() : "Clean Article Notes";
            markdown.append("# ").append(title).append("\n\n---\n\n");

            Elements elements = doc.select("article h1, article h2, article h3, article p, main p, body p");
            for (Element el : elements) {
                String text = el.text().trim();
                if (!text.isEmpty()) {
                    if (el.tagName().startsWith("h")) {
                        markdown.append("## ").append(text).append("\n\n");
                    } else {
                        markdown.append(text).append("\n\n");
                    }
                }
            }

            return markdown.toString();

        } catch (Exception e) {
            return "Unable to parse URL: " + e.getMessage();
        }
    }
}