package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview kingdom = new MovieReview();
        kingdom.title = "킹덤";
        kingdom.review = "시즌3 언제나와요?ㅠ";

        MovieReview asinjon = new MovieReview();
        asinjon.title = "킹덤:아신전";
        asinjon.review = "전지현 가엾어ㅠ";

        MovieReview[] reviews = {kingdom, asinjon};

        for (MovieReview r : reviews) {
            System.out.println(r.title + ' ' + r.review);

        }



    }

}
