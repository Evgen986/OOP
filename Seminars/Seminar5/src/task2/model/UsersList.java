package task2.model;

import java.util.ArrayList;
import java.util.List;

public class UsersList{
    private List<Company> companyList;
    private List<Human> humansList;

    {
        companyList = new ArrayList<>();
        humansList = new ArrayList<>();
    }

    public List<Human> getHumanList(){
        return humansList;
    }

    public List<Company> getCompanyList(){
        return companyList;
    }
}
