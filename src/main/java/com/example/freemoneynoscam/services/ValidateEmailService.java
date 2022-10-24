package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.repository.Repository;
import org.springframework.web.context.request.WebRequest;

public class ValidateEmailService {
    Repository repository = new Repository();
    public boolean isEmailValid(WebRequest dataFromForm){

        String email = dataFromForm.getParameter("email");

        if (email.contains("@") && email.contains(".")){
            repository.addEmailToDatabase(email);
            return true;
        } else return false;
    }
}
