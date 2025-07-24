package student.exercise;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        MovieInfo[] movies = new MovieInfo[4];
        movies[0] = new MovieInfo(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1] = new MovieInfo(2,"出拳吧",39,7.8,"唐晓白","天宇","3.5万人想看");
        movies[2] = new MovieInfo(3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看");
        movies[3] = new MovieInfo(4,"一点就到家",35,8.7,"许宏宇","刘昊然","10.8万人想看");

        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入搜的电影：");
        int num = sc.nextInt();
        operator.SearchMovieById(num);


    }



}
