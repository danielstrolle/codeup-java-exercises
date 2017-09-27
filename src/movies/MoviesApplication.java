package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    static Movie[] movies;
    public static void main(String[] args) {
        Input input = new Input();
        movies = MoviesArray.findAll();
        int userChoice;
        do {
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category);");
            System.out.println("6 - add a new movie");
            System.out.println();
            System.out.println("Enter your choice: ");
            int min = 0;
            int max = 6;
            userChoice = input.getInt(min, max);

            switch (userChoice) {
                case 0:
                    System.out.println("ok, goodbye!");
                    break;
                case 1:
                    listMovies("all");
                    break;
                case 2:
                    listMovies("animated");
                    break;
                case 3:
                    listMovies("drama");
                    break;
                case 4:
                    listMovies("horror");
                    break;
                case 5:
                    listMovies("scifi");
                    break;
                case 6:
                    addMovie();
                    break;
            }

//            if (userChoice == 1) {
//                listMovies("all");
//
//            } else if (userChoice == 2) {
//                listMovies("animated");
//
//            } else if (userChoice == 3) {
//                listMovies("drama");
//
//            } else if (userChoice == 4) {
//                listMovies("horror");
//
//            } else if (userChoice == 5) {
//                listMovies("scifi");
//            }
        } while (userChoice !=0);
//        System.out.println("ok, goodbye!");
    }

    public static void listMovies (String categoryFilter) {


        for (Movie movie : movies) {
            String movieCategory = movie.getCategory();
            if (movieCategory.equalsIgnoreCase(categoryFilter) || categoryFilter.equalsIgnoreCase("all")) {
                System.out.println(movie.getName() + ", Category: " + movie.getCategory());
            }
        }
    }

    public static void addMovie() {
        Input input = new Input();
        System.out.println("Enter the name of the movie");
        String newMovieName = input.getString();
        System.out.println("Enter the category of the movie");
        String newMovieCategory = input.getString();
        Movie newMovie = new Movie(newMovieName, newMovieCategory);
        int newArrayLength = (movies.length + 1);
        System.out.println(newArrayLength);
        Movie[] newMovies = Arrays.copyOf(movies, newArrayLength);
        newMovies[newArrayLength] = newMovie;
        System.out.println(newMovies);
    }
}
