const randomColor = (
  colors = [
    "red",
    "blue",
    "green",
    "yellow",
    "black",
    "pink",
    "maroon",
    "orange",
  ]
) => {
  return colors[Math.round(Math.random() * colors.length - 1)];
};

const valueToPx = (n) => n + "px";
const pxToValue = (prop) => prop.match(/\{\d+:\d+\}/)[0];

const shrek = createShrek();
document.body.onmousemove = function (e) {
  const shrek = Math.random() > 0.95 ? createShrek() : null;
  if (!shrek) return;
  shrek.onload = () => document.body.appendChild(shrek);
  shrek.style.left = `${e.clientX}px`;
  shrek.style.top = `${e.clientY}px`;
};

const tags = document.body.querySelectorAll("*");

shrek.onload = () => {
  document.body.append(shrek);

  tags.forEach((tag) => {
    tag.style.backgroundColor = randomColor();
    tag.style.transition = `all ${randDecimal()}s`;

    setInterval(() => {
      const randWidth = Math.round(Math.random() * 100);
      tag.style.width = `${randWidth}vw`;
      const randHeight = Math.round(Math.random() * 100);
      tag.style.height = `${randHeight}vh`;
    }, 100);
  });
};

function randDecimal() {
  return (Math.round(Math.random()) * 10) / 10 + 1;
}

function createShrek() {
  const shrek = new Image();

  const gifs = [
    "https://c.tenor.com/qfQ2YhGCHhoAAAAC/shrek-dance.gif",
    "https://c.tenor.com/u9J4mhaJ2yYAAAAC/shrek-meme-shrek-gif.gif",
    "https://c.tenor.com/2m4fA2lvAGUAAAAC/tomapanymoja-shrek-baby.gif",
  ];
  shrek.src = gifs[Math.round(Math.random() * gifs.length - 1)];
  shrek.style.margin = "auto";
  shrek.style.position = "absolute";
  if (Math.random() > 0.8) {
    shrek.style.animation = `spin ${randDecimal()}s linear infinite`;
  }
  return shrek;
}
