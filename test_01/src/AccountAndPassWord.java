public class AccountAndPassWord {
    //实现登录注册的数据主体（实体类）
    private String account;
    private String password;

    //生成构造器
    public AccountAndPassWord(String account, String password) {
        this.account = account;
        this.password = password;
    }

    //GetterAndSetter
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountAndPassWord accountAndPassWord = (AccountAndPassWord) o;
        return account.equals(accountAndPassWord.account);
    }
}
