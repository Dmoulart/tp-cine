import { moviedb } from "./moviedb-api.js";

const title = document.getElementById("movie-title").innerHTML;

const movie = await moviedb.search(title);

if (movie.poster) {
  addPoster(movie.poster);
  addBackgroundPoster(movie.poster);
}

function addPoster(poster) {
  const aside = document.getElementById("aside-poster");
  const image = new Image();
  image.src = poster;
  image.style.width = "35vw";
  image.style.height = "auto";
  image.onload = function () {
    aside.appendChild(image);
  };
}
function addBackgroundPoster(poster) {
  const image = new Image();
  const div = document.createElement("div");
  div.id = "bg-img";

  image.src = poster;
  div.style.position = "absolute";
  div.style.zIndex = "-1";
  div.style.left = "0";
  div.style.top = "0";
  div.style.width = "100vw";
  div.style.height = "auto";
  div.style.backgroundImage = `url('${movie.poster}')`;
  div.style.filter = "blur(10px)";
  div.style.opacity = "0.5";
  image.onload = function () {
    div.appendChild(image);
    document.body.appendChild(div);
    //document.body.appendChild(image);
  };
}
