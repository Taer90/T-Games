package data;

public enum LoginForm {
    WRONG_EMAIL("aaa123"),
    CORRECT_EMAIL("asd123@asd.ru");

    private String email;

    LoginForm(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
