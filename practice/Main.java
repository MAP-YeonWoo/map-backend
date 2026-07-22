import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("기생충", "드라마", 2019));
        movieList.add(new Movie("인터스텔라", "SF", 2014));
        movieList.add(new Movie("어벤져스", "액션", 2019));

        for (Movie movie : movieList) {
            System.out.println("제목 : " + movie.getTitle());
            System.out.println("장르 : " + movie.getGenre());
            System.out.println("개봉연도 : " + movie.getReleaseYear());
            System.out.println("--------------------");
        }
        Store store = new Store(
                1L,
                "가게이름a",
                "서울시 강남구"
        );

        Mission mission = new Mission(
                1L,
                "12,000원 이상 식사",
                store
        );

        System.out.println(mission.getStore().getName());
    }
}