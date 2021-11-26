import { moviedb } from "./moviedb-api.js";

const filmsImgElements = document.querySelectorAll(".film-img");

filmsImgElements.forEach(async (film) => {

  const movieData = await moviedb.search(film.id);

  if (movieData) {
    film.src = movieData.poster;
  }
  
});

// title.onchange = async function () {
//   console.log("search");

//   const movie = await moviedb.search(title.value.trim());
//   console.log(title.value);
//   console.log(movie);

//   if (!movie) return;

//   setPoster(movie.poster);
//   setSynopsis(movie.overview);
//   setYear(movie.release_date);
// };
// function setPoster(poster) {
//   image.src = poster;
//   image.style.width = "100%";
//   image.style.height = "auto";
//   image.onload = function () {
//     aside.appendChild(image);
//   };
// }

// function setSynopsis(overview) {
//   synopsis.value = overview;
// }
// function setYear(releaseDate) {
//   const yearInString = /\d{4}/g;
//   year.value = releaseDate.match(yearInString)?.[0] ?? "";
// }
