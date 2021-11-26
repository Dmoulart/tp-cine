const apiKey = "6bc1b50804e591772bbe1c334180e39d";


export const moviedb = {


  base: "https://api.themoviedb.org/3/",
  endpoint: "search/movie",
  token: `?api_key=${apiKey}`,
  lang: "&language=fr-FR",
  query: (value) => `&query=${value}`,
  page: "&page=1",
  adult: "&include_adult=false",

  search: async (title) => {
    const url = `${moviedb.base}${moviedb.endpoint}${moviedb.token}${
      moviedb.lang
    }${moviedb.query(title)}${moviedb.page}${moviedb.adult}`;

    const res = await fetch(url).then((res) => res.text());
    const data = JSON.parse(res);
    
    if (!data || !data.results || !data.results.length) {
      console.warn("No results for " + title + "were found on the api");
      return;
    }


    const movie = data.results[0];
    
    return { ...movie, poster: moviedb.getPoster(movie["poster_path"]) };
  },

  posterEndpoint: "https://image.tmdb.org/t/p/original/",
  getPoster: (fileName) => moviedb.posterEndpoint + fileName,
};
