package by.kr.authorisation;

public class Authorisation {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signUp(String login, String password) {
        //нужна ли вообще она?
        //Скорее всего нет, но если надо, то после идет обращение к бд и сохранение туда логина и пароля
    }

    public boolean signIn(String login, String password) {
        //отправка запроса к бд, есть ли такой

        setLogin(login);
        setPassword(password);

        boolean flag = false; //вошел или нет
        return flag;
    }
}
