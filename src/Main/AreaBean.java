package Main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class AreaBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting(){
        if("".equals(name) || name == null) {
            return "Hello, stranger!";
        } else {
            return "Welcome " + name;
        }

    }
}
