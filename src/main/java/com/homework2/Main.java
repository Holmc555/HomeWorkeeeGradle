package com.homework2;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        GradleProject gradleProject = new GradleProject("Oleh", "Hordiienko");

        Gson gson = new Gson();
        String json = gson.toJson(gradleProject);

        System.out.println(json);

    }
}
