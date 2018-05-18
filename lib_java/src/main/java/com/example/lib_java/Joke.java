package com.example.lib_java;

public class Joke {

    private static String[] JOKE_LIST = {"Q: What goes up and down but does not move?\nA: Stairs",
            "Q: Where should a 500 pound alien go?\nA: On a diet",
            "Q: What did one toilet say to the other?\nA: You look a bit flushed.",
            "Q: Why did the picture go to jail?\nA: Because it was framed.",
            "Q: What did one wall say to the other wall?\nA: I'll meet you at the corner.",
            "Q: What did the paper say to the pencil?\nA: Write on!",
            "Q: What do you call a boy named Lee that no one talks to?\nA: Lonely",
            "Q: What gets wetter the more it dries?\nA: A towel.",
            "Q: Why do bicycles fall over?\nA: Because they are two-tired!",
            "Q: Why do dragons sleep during the day?\nA: So they can fight knights!"};

    public static String getJoke() {
        int ranId = (int)(Math.random()*10);
        return JOKE_LIST[ranId];
    }

    public static void main(String[] args) {
        Joke joke = new Joke();
        System.out.println(joke.getJoke());
    }

}
