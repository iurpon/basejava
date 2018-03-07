package ru.javawebinar.basejava.model;

public class TextSection extends Section {
    private final String content;

    public TextSection(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;

        TextSection that = (TextSection) o;

        return content != null ? content.equals(that.content) : that.content == o;
    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }
}
