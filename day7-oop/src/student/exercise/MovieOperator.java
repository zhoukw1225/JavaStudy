package student.exercise;

public class MovieOperator {
    private MovieInfo[] movies;

    public MovieOperator(MovieInfo[] movies){
        this.movies = movies;
    }


    public void printAllMovies(){
        System.out.println("所有电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            MovieInfo m  = movies[i];
            System.out.println("编号"+m.getId());
            System.out.println("名称" + m.getTitle());
            System.out.println("价格" + m.getPrice());
            System.out.println("------------------------------");
        }
    }


    public void SearchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            MovieInfo m  = movies[i];
            if(m.getId()==id){
                System.out.println("电影详情如下：");
                System.out.println("编号"+m.getId());
                System.out.println("名称" + m.getTitle());
                System.out.println("价格" + m.getPrice());
                System.out.println("评分"+m.getScore());
                System.out.println("导演" + m.getDirector());
                System.out.println("演员" + m.getActor());
                System.out.println("信息" + m.getInfo());
                return;
            }
        }
        System.out.println("没有该部电影");
    }
}

