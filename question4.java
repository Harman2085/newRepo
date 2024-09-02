

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private final String movieId;

    private static int moviesCount = 0;

    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("Movie name and produced by are mandatory fields.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        incrementMoviesCount();
        this.movieId = generateMovieId();
    }

    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    private void incrementMoviesCount() {
        moviesCount++;
    }

    private String generateMovieId() {
        return movieName + "_" + moviesCount;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public String showDetails() {
        return "Movie ID: " + getMovieId() + "\n" +
               "Movie Name: " + movieName + "\n" +
               "Produced By: " + producedBy + "\n" +
               "Directed By: " + (directedBy != null ? directedBy : "N/A") + "\n" +
               "Duration: " + (duration > 0 ? duration + " minutes" : "N/A") + "\n" +
               "Year: " + (year > 0 ? year : "N/A") + "\n" +
               "Category: " + (category != null ? category : "N/A");
    }
}


public class SpecialMovie extends Movie {
    private String soundEffects;
    private String visualEffects;

    public SpecialMovie(String movieName, String producedBy, String soundEffects, String visualEffects) {
        super(movieName, producedBy);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String soundEffects, String visualEffects) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + "\n" +
               "Sound Effects: " + (soundEffects != null ? soundEffects : "N/A") + "\n" +
               "Visual Effects: " + (visualEffects != null ? visualEffects : "N/A");
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }
}


public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private final String movieId;

    private static int moviesCount = 0;

    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("Movie name and produced by are mandatory fields.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        incrementMoviesCount();
        this.movieId = generateMovieId();
    }

    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    private void incrementMoviesCount() {
        moviesCount++;
    }

    private String generateMovieId() {
        return movieName + "_" + moviesCount;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public String showDetails() {
        return "Movie ID: " + getMovieId() + "\n" +
               "Movie Name: " + movieName + "\n" +
               "Produced By: " + producedBy + "\n" +
               "Directed By: " + (directedBy != null ? directedBy : "N/A") + "\n" +
               "Duration: " + (duration > 0 ? duration + " minutes" : "N/A") + "\n" +
               "Year: " + (year > 0 ? year : "N/A") + "\n" +
               "Category: " + (category != null ? category : "N/A");
    }
}


public class SpecialMovie extends Movie {
    private String soundEffects;
    private String visualEffects;

    public SpecialMovie(String movieName, String producedBy, String soundEffects, String visualEffects) {
        super(movieName, producedBy);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String soundEffects, String visualEffects) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + "\n" +
               "Sound Effects: " + (soundEffects != null ? soundEffects : "N/A") + "\n" +
               "Visual Effects: " + (visualEffects != null ? visualEffects : "N/A");
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }
}


public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + "\n" +
               "Country: " + (country != null ? country : "N/A") + "\n" +
               "Language: " + (language != null ? language : "N/A");
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
}


public class Main {
    public static void main(String[] args) {
        // Array of Movie objects
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("Inception", "Emma Thomas");
        movies[1] = new SpecialMovie("Avatar", "James Cameron", "Dolby Atmos", "CGI");
        movies[2] = new InternationalMovie("Parasite", "Kwak Sin-ae", "South Korea", "Korean");

        // Traverse the array and call showDetails() on all objects
        for (Movie movie : movies) {
            System.out.println(movie.showDetails());

            // Typecasting to access methods specific to subclasses
            if (movie instanceof SpecialMovie) {
                SpecialMovie specialMovie = (SpecialMovie) movie;
                System.out.println("Sound Effects: " + specialMovie.getSoundEffects());
                System.out.println("Visual Effects: " + specialMovie.getVisualEffects());
            }

            if (movie instanceof InternationalMovie) {
                InternationalMovie internationalMovie = (InternationalMovie) movie;
                System.out.println("Country: " + internationalMovie.getCountry());
                System.out.println("Language: " + internationalMovie.getLanguage());
            }

            System.out.println();
        }
    }
}
