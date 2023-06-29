package cokr.sntsoft.studentmanager.student;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private HashMap<Integer,Student> mydata = new HashMap<>(); 
}
