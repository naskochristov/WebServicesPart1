
package com.ignyte.whatsshowing;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ignyte.whatsshowing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ignyte.whatsshowing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTheatersAndMovies }
     * 
     */
    public GetTheatersAndMovies createGetTheatersAndMovies() {
        return new GetTheatersAndMovies();
    }

    /**
     * Create an instance of {@link GetTheatersAndMoviesResponse }
     * 
     */
    public GetTheatersAndMoviesResponse createGetTheatersAndMoviesResponse() {
        return new GetTheatersAndMoviesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTheater }
     * 
     */
    public ArrayOfTheater createArrayOfTheater() {
        return new ArrayOfTheater();
    }

    /**
     * Create an instance of {@link GetUpcomingMovies }
     * 
     */
    public GetUpcomingMovies createGetUpcomingMovies() {
        return new GetUpcomingMovies();
    }

    /**
     * Create an instance of {@link GetUpcomingMoviesResponse }
     * 
     */
    public GetUpcomingMoviesResponse createGetUpcomingMoviesResponse() {
        return new GetUpcomingMoviesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUpcomingMovie }
     * 
     */
    public ArrayOfUpcomingMovie createArrayOfUpcomingMovie() {
        return new ArrayOfUpcomingMovie();
    }

    /**
     * Create an instance of {@link Theater }
     * 
     */
    public Theater createTheater() {
        return new Theater();
    }

    /**
     * Create an instance of {@link ArrayOfMovie }
     * 
     */
    public ArrayOfMovie createArrayOfMovie() {
        return new ArrayOfMovie();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link UpcomingMovie }
     * 
     */
    public UpcomingMovie createUpcomingMovie() {
        return new UpcomingMovie();
    }

}
