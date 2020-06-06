package com.Maulida.project4.repository;

import com.Maulida.project4.model.CastAndCrew;
import com.Maulida.project4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance() {
        if (instance == null) {
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> Pokemon() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zFOhkOTby060i4pxpCRKR53SuLT.jpg", "Ikue Otani"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jSQPB45PbMYmSFGnlX9nGM9DRr4.jpg", "Unsho Ishizuka"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/btCUFtJEE7RefoguctvvfQjxIcd.jpg", "Megumi Hayashibara"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/21KJlWbE6qAQA7cTwbeCPSuaALI.jpg", "Shin-ichiro Miki"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/leCRUplJe0J5VIAWwXK3eNORyK1.jpg", "Inuko Inuyama"));
        return al;
    }

    public List<CastAndCrew> FamilyGuy() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rcxgL68bm4PQkiWDhHJWaGDzKkU.jpg", "Seth MacFarlane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/evbCnRe5Yfuy0B41PONLTIcvbem.jpg", "Alex Borstein"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/l4No5Eu6j0U80hCIkaSn17AOWrj.jpg", "Seth Green"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6Lp9qPkMO740Hcp8NBYZZLWWvJF.jpg", "Mila Kunis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iYNPvFjsx07iYE1WRp4EIDnxDhH.jpg", "Mike Henry"));
        return al;
    }

    public List<CastAndCrew> TheSimpsons() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AmeqWhP4A46AWkM4kVphg6jOTQX.jpg", "Dan Castellaneta"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/x3oG3OXtBfTFgqXPqxI1GKVEiaQ.jpg", "Julie Kavner"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/40qNhyYJhSE2Yiy4pnXSZhdufO6.jpg", "Nancy Cartwright"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9AjPwbb3uz4GfgOPBYsy2ILvwkB.jpg", "Yeardley Smith"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uON3TWSySIy8wbDhkSzmFTDM6XO.jpg", "Hank Azaria"));
        return al;
    }

    public List<CastAndCrew> Shield(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mq686D91XoZpqkzELn0888NOiZW.jpg", "Clark Gregg"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yvhsrdCayqZmo6VOk9XrntLMUFO.jpg", "Ming-Na Wen"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ba61bJ4RohH7Ks80xSUGZ1HtKF1.jpg", "Chloe Bennet"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kZragNGDCYOTcf9I9gnnDXw35Mr.jpg", "Iain De Caestecker"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ohoSW1kYL3GMlFgGWuLEC1IzjmE.jpg", "Elizabeth Henstridge"));
        return al;
    }

    public List<CastAndCrew> _13ReasonWhy(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fmRHI0ovny7lk27TzejA47or802.jpg", "Dylan Minnette"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rYl9pJbIONDUtJBO1skQULDfUz1.jpg", "Christian Navarro"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/d97PBeHPYIJ4hshqoe2ahRJ2NIq.jpg", "Alisha Boe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qf07V6vbPakEPQhvL02ysweud2h.jpg", "Brandon Flynn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/asJ1bchERNBwcWS3Do7xSaYNOmX.jpg", "Ross Butler"));
        return al;
    }

    public List<CastAndCrew> TheFlash(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kEGU1gGySIe63lyL7AnwXEw4rQn.jpg", "Grant Gustin"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/t9YV7TTQXkDWLmoHx8Mu3OUHqsP.jpg", "Candice Patton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uDQWtrmSPsNsm2DL3TMMiAtVoTq.jpg", "Carlos Valdes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/faX0EDc44GL5ZcsEcxTOBcfWpCP.jpg", "Danielle Panabaker"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iFkViDKW65daGl74VYK3FOvCLfZ.jpg", "Tom Cavanagh"));
        return al;
    }

    public List<CastAndCrew> NCIS(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lMqKPig7zBoGfou7wWf88sZEGHo.jpg", "Mark Harmon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/47no2X4533Ehk2VO3BvVqUBqMUd.jpg", "David McCallum"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mqxeD2ZMyOXvcurReKUtctNmS4Z.jpg", "Sean Murray"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/scb8cQt9u6AdhEHg7RJDUtdhHkg.jpg", "Pauley Perrette"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/o4UqLl3mx7SvFhr9xrpFv7VLpCS.jpg", "Michael Weatherly"));
        return al;
    }

    public List<CastAndCrew> Vikings(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rwZAopZovcxCsgi22nazgamsPht.jpg", "Katheryn Winnick"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oyOHvNdJcOTQGZuAimene2Wlghw.jpg", "Peter Franzén"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/unP5YUgEdECL2gMLs0zCNya6is6.jpg", "Alexander Ludwig"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aZZy9NQEZdhlXWS2i8N00gxW6LU.jpg", "Jasper Pääkkönen"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/4iimMsE2JI0W3VXOMj0rSZtX70n.jpg", "Moe Dunford"));
        return al;
    }

    public List<CastAndCrew> TheWalkingDead(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ozHPdO5jAt7ozzdZUgyRAMNPSDW.jpg", "Norman Reedus"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bu1uBQM6ODGRE5TEm6l8gmyOApn.jpg", "Andrew Lincoln"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/z7H7QeQvr24vskGlANQhG43vozQ.jpg", "Danai Gurira"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/w7LGO0SdH2w1vey52yksohI0BqQ.jpg", "Chandler Riggs"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/a1yjfKwaLbSpgzOfDdnNk2nxaQx.jpg", "Melissa McBride"));
        return al;
    }

    public List<CastAndCrew> TheVampireDiaries(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/eP7FoWuVtrQ8pRqSGwxbwBUB3CL.jpg", "Paul Wesley"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xECvTp6Cw5fRzrlmoGhl7AflruY.jpg", "Ian Somerhalder"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9AvpU8NAcPJRcioeNm5kVo4rPZg.jpg", "Kat Graham"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xfqDBR8P8q25kGCLpHj4xIZLoGS.jpg", "Candice King"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mxWxwVzx5vG6wwg2z9ELtbqtz7e.jpg", "Zach Roerig"));
        return al;
    }

    public List<CastAndCrew> Gotham(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/dHj2xtDOuZc193W4UpQkq4niZcy.jpg", "Ben McKenzie"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oRj908uSHpCWQKQ9DfzzZrwKpcs.jpg", "Donal Logue"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/13lIdP9RSdK44lpJtKz3OlYCMxp.jpg", "David Mazouz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/j4pAEMhKL5vA61ADrkxxLFtcI4c.jpg", "Sean Pertwee"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bF6ySz4ByruGRz9REmN3hK3WxpI.jpg", "Robin Lord Taylor"));
        return al;
    }

    public List<CastAndCrew> AdventureTime(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qTV1zef7qpQsNhjGh1QcKO00ZxZ.jpg", "Jeremy Shada"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/awmyFwU6ErFJbGFFzhBYZ9AQn8m.jpg", "John DiMaggio"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/b9zMwpHnVMarGGhqLR6ckrnaHpB.jpg", "Tom Kenny"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/pFSy3Q57oU39NVebHzPkpTrANZe.jpg", "Olivia Olson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fpGmSNSkwTaixEGAwC14A88JYAH.jpg", "Dee Bradley Baker"));
        return al;
    }

    public List<CastAndCrew> MoneyHeist(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wZkK15LnloSAhzs1jxI3AZbR6f0.jpg", "Úrsula Corberó"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2TGPhdpRC5wjdFEJqnLYiN5kbwg.jpg", "Álvaro Morte"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6OrC7CNSAMsf7Y96iPc53jIpmFr.jpg", "Itziar Ituño"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/llGDFMdR3xNAIHENP50KOtaUcHX.jpg", "Pedro Alonso"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9ExASXw097MyNuSy6N23fpkqpXq.jpg", "Alba Flores"));
        return al;
    }

    public List<CastAndCrew> TheGoodDoctor(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hOBMoJSANFYaHi2Aqv4gYnIkMMX.jpg", "Freddie Highmore"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/4QBRarzz68vQCiXteI1TMopj3zn.jpg", "Nicholas Gonzalez"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1VaSdCjWhft9sLpeaslznSrWyEL.jpg", "Antonia Thomas"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bUzVvgD066zYGJ9amJzgoGivlqD.jpg", "Hill Harper"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xlAqt3pkr4GU4yNmXzneQd83Qq.jpg", "Richard Schiff"));
        return al;
    }

    public List<CastAndCrew> StarTrek(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wEy5qSDT5jT3ZASc2hbwi59voPL.jpg", "Patrick Stewart"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/koY6DtPAnuiJpdOW3bPHzmoC6cZ.jpg", "Jonathan Frakes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ipAF52eFiEhUZRsQZoUzbFY0qb2.jpg", "Brent Spiner"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/55xWHDtf7xHFdS6IKicqVzEfTo7.jpg", "Michael Dorn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/4MtPZKqVsU5iFWvl4hgqumhYItC.jpg", "Marina Sirtis"));
        return al;
    }

    public List<CastAndCrew> DefendingJacob(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7dUkkq1lK593XvOjunlUB11lKm1.jpg", "Chris Evans"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5og2DocZSFkIgheoPrcCBd89oKI.jpg", "Michelle Dockery"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1UDAa01H8wJez5MxAz0WOSDvQIC.jpg", "Jaeden Martell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/eAq9waPDjKV9kaKiiCT5x7vR0o.jpg", "Cherry Jones"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1IhXVbbeLQxuyYRNT4M2KWi9ehr.jpg", "Pablo Schreiber"));
        return al;
    }

    public List<CastAndCrew> CSI_Miami(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7XjPzadIBQ0mIVwVT7o87B7NkJJ.jpg", "David Caruso"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/vGE1IXBlLIKNjxpobtr4ynGFfeP.jpg", "Emily Procter"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bItjbs27qfBslaZ5mUkIKKQvacj.jpg", "Adam Rodríguez"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5jVSijJu670ReUihGhiyTtGbZsp.jpg", "Rex Linn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/s6SVfTHfn4VLXmsl8l3QjJzpako.jpg", "Jonathan Togo"));
        return al;
    }

    public List<CastAndCrew> Chernobyl(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mGODbYpkR1NKBOV3rtTfZ7EWoIl.jpg", "Jared Harris"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wCpWjalD8d4MNuAdYupYf3viT1I.jpg", "Stellan Skarsgård"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oJerQ7xq5uLTsxjqGWzsbYCjobh.jpg", "Emily Watson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/pCUnyy7AkjklP0qHc1egmu9u33Q.jpg", "Paul Ritter"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/suPlvXS2HBGlWhb3RbtLeUh62T.jpg", "Jessie Buckley"));
        return al;
    }

    public List<CastAndCrew> LawnOrder(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5js80EIF60a4G1iYAVJgwjFtP89.jpg", "Vincent D'Onofrio"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gJ3hlTzTjpTVBsGadvUQGiBgjsV.jpg", "Kathryn Erbe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/q4oCmhqEPXKSRK2hTZzTz2Zt4Ba.jpg", "Courtney B. Vance"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9NYC3VL2D58NfPoqpMy6e0Y9XpQ.jpg", "Jamey Sheridan"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nNwNGlXSJcd84u0G3gUvk2wGnVi.jpg", "Leslie Hendrix"));
        return al;
    }

    public List<CastAndCrew> Dark(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bReOiTHOCNBdLRyNJRhJPVYXUsC.jpg", "Karoline Eichhorn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rBxVWmlnBVumHRhHhQmuZUTfiFN.jpg", "Jördis Triebel"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/m3Mo38afbKmy9EOsfmUagvTFM9q.jpg", "Louis Hofmann"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/vyGIt8F9cs3i2MNomb8cLkO1p3p.jpg", "Maja Schöne"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/e1pJcPKL0FaqdJ33j0JXd7TaCLW.jpg", "Deborah Kaufmann"));
        return al;
    }

    public List<Movies> getData(){
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gHUCCMy1vvj58tzE3dZqeC9SXus.jpg","Marvel's Agents of S.H.I.E.L.D. (2013)","Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.","Drama, Sci-Fi & Fantasy, Action & Adventure","43 m","Joss Whedon","2013", Shield()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qcr9bBY6MVeLzriKCmJOv1562uY.jpg","The Simpsons (1989)","Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.","Animation, Comedy","22 m","Matt Groening","1989", TheSimpsons()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2AoqUTKKN4kjNe1K0kIPwiItHwv.jpg","Pokémon (1997)","Bergabunglah dengan Ash Ketchum, ditemani oleh mitranya Pikachu, saat ia melakukan perjalanan ke banyak daerah, bertemu teman-teman baru dan menghadapi tantangan baru dalam upayanya untuk menjadi Master Pokemon.","Animasi ,  Aksi & Petualangan ,  Fiksi Ilmiah & Fantasi","22 m","Satoshi Tajiri","1997", Pokemon()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nel144y4dIOdFFid6twN5mAX9Yd.jpg","13 Reasons Why (2017)","After a teenage girl's perplexing suicide, a classmate receives a series of tapes that unravel the mystery of her tragic choice.","Drama, Mystery","57 m","Brian Yorkey","2017", _13ReasonWhy()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg","The Flash (2014)","After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only meta-human who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","Drama, Sci-Fi & Fantasy","44 m","Greg Berlanti","2014", TheFlash()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg","NCIS (2003)","From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.","Action & Adventure, Crime, Drama","45 m","Donald P. Bellisario","2003", NCIS()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ff1zhqvwfS5HvRNcA5UFrH0PA2q.jpg","Vikings (2013)","The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.","Action & Adventure, Drama","44 m","Michael Hirst","2013", Vikings()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5l10EjdgPxu8Gbl5Ww6SWkVQH6T.jpg","The Walking Dead (2010)","Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.","Action & Adventure, Drama, Sci-Fi & Fantasy","42 m","Frank Darabont","2010", TheWalkingDead()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg","Gotham (2014)","Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?","Drama, Fantasy, Crime","43 m","Bruno Heller","2014", Gotham()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/b3vl6wV1W8PBezFfntKTrhrehCY.jpg","The Vampire Diaries (2009)","The story of two vampire brothers obsessed with the same girl, who bears a striking resemblance to the beautiful but ruthless vampire they knew and loved in 1864.","Drama, Fantasy, Horror, Romance","43 m","Kevin Williamson","2009", TheVampireDiaries()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg","Family Guy (1999)","Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.","Animation, Comedy","22 m","Seth MacFarlane","1999", FamilyGuy()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aI6T8RLob4f864wK6vXccg8DOqR.jpg","Adventure Time (2010)","Hook up with Finn and Jake as they travel the Land of Ooo searching for adventure. But remember, adventure isn’t always easy. Sometimes you’ve got to battle fire gnomes that torture old ladies, save a smelly hot dog princess from the Ice King, and thaw out a bunch of frozen businessmen. What the cabbage?!","Fantasy, Animation, Comedy","11 m","Larry Leichliter","2010", AdventureTime()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/MoEKaPFHABtA1xKoOteirGaHl1.jpg","Money Heist (2017)","To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.","Crime, Drama","1h 10m","Abdón Alcañiz","2017", MoneyHeist()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg","The Good Doctor (2017)","A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?","Drama","42 m","Mike Listo","2017", TheGoodDoctor()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aV6G8ZbR5wIu9N9O8xgJeQFVUky.jpg","Star Trek: The Next Generation (1987)","Follow the intergalactic adventures of Capt. Jean-Luc Picard and his loyal crew aboard the all-new USS Enterprise NCC-1701D, as they explore new worlds.","Action & Adventure, Drama, Mystery, Sci-Fi & Fantasy","45 m","Cliff Bole","1987", StarTrek()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/JTmkzwSDRiS9nvSPwpDB9fmZj2.jpg","Defending Jacob (2020)","A family’s lives are irreparably disrupted when the 14-year-old son is accused of murdering a fellow classmate.","Drama, Mystery, Crime","50 m","Morten Tyldum","2020", DefendingJacob()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nnOuzDTCq8xUCXycA46dLSmz8yv.jpg","CSI: Miami (2002)","CSI: Miami follows Crime Scene Investigators working for the Miami-Dade Police Department as they use physical evidence, similar to their Las Vegas counterparts, to solve grisly murders. The series mixes deduction, gritty subject matter, and character-driven drama in the same vein as the original series in the CSI franchise, except that the Miami CSIs are cops first, scientists second.","Drama, Mystery, Crime","42 m","Tom Yatsko","2002", CSI_Miami()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg","Chernobyl (2019)","The true story of one of the worst man-made catastrophes in history: the catastrophic nuclear accident at Chernobyl. A tale of the brave men and women who sacrificed to save Europe from unimaginable disaster.","Drama","1h 10m","Paulius Dascioras","2019", Chernobyl()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xMxeq0IMQsuyJ4itzUS0WAh9Ukh.jpg","Law & Order: Criminal Intent (2001)","The third installment of the “Law & Order” franchise takes viewers deep into the minds of its criminals while following the intense psychological approaches the Major Case Squad uses to solve its crimes.","Drama","1 h","Frank Prinzi","2001", LawnOrder()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ajmkAwuK1TRFWMjKoSMgoAXbnc7.jpg","Dark (2017)","A missing child causes four families to help each other for answers. What they could not imagine is that this mystery would be connected to innumerable other secrets of the small town.","Sci-Fi & Fantasy, Drama, Mystery, Crime","53 m","Stefan Hauck","2017", Dark()));
        return list;
    }

    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
