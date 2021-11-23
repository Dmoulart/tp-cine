import { moviedb } from "./moviedb-api.js";
const form = document.getElementById("form");
const title = document.getElementById("titreInput");
const synopsis = document.getElementById("synopsisInput");
const year = document.getElementById("anneInput");
const aside = document.getElementById("aside-poster");
const image = new Image();

form.onkeydown = function (e) {
  const code = e.keyCode || e.which;
  if (code == 13) {
    e.preventDefault();
    return false;
  }
};

title.onchange = async function () {
  console.log("search");

  const movie = await moviedb.search(title.value.trim());
  console.log(title.value);
  console.log(movie);

  if (!movie) return;

  setPoster(movie.poster);
  setSynopsis(movie.overview);
  setYear(movie.release_date);
};
function setPoster(poster) {
  image.src = poster;
  image.style.width = "100%";
  image.style.height = "auto";
  image.onload = function () {
    aside.appendChild(image);
  };
}

function setSynopsis(overview) {
  synopsis.value = overview;
}
function setYear(releaseDate) {
  const yearInString = /\d{4}/g;
  year.value = releaseDate.match(yearInString)?.[0] ?? "";
}
