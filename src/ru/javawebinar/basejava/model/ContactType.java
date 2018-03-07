package ru.javawebinar.basejava.model;

public enum ContactType {
    PHONE ("Тел."),
    MOBILE ("Мобильный"),
    HOME_PHONE ("Домашний тел."),
    SKYPE ("Scype"),
    MAIL ("Почта"),
    LINKEDIN ("Профиль LinkedIn"),
    GITHUB ("Профиль GitHub"),
    STACKOVERFLOW ("Профиль Stackoverflow"),
    HOME_PAGE ("Домашняя страница");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
