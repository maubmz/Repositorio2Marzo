

interface AudioPlayer{
    audioVolume: number;
    songDuration: number;
    song: string;
    details: Details;
}

interface Details{
    author: string;
    year: number;
}

const audioPlayer: AudioPlayer = {
    audioVolume: 90,
    songDuration: 36,
    song: "Es un secreto",
    details: {
        author: "Plan B",
        year: 2008
    }
}
const song = "New Song";

//const {song :anotherSong ,songDuration:duration , details/*details:{author, year}*/} = audioPlayer;
//const {author , year} = details;
//console.log("Song: ", anotherSong);
//console.log("Duration: ", duration);
//console.log("Author: ", author);
//console.log("Year: ", year)

const [p1,p2,trunks = "Not found"]: string[] =["Goku", "Vegeta"];
//const trunks = dbz[3] || "No hay personaje";

console.error("Personaje 3: ", trunks);



export{};