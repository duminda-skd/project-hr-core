package com.hr.service.absence;

import com.hr.tables.pojos.Employee;
import java.util.List;

public class AbsenceController {

    private AbsenceModel abMod;

    {
        abMod = new AbsenceModel();
    }

    public List<Employee> getLeavesLeft() {
        List<Employee> leavesLeftByEmpId = abMod.getLeavesLeft();
        return leavesLeftByEmpId;
    }
}
