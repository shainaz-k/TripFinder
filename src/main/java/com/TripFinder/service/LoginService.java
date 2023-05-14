package com.TripFinder.service;

import com.TripFinder.exceptions.LogInException;
import com.TripFinder.model.UserLogin;


public interface LoginService {

    public String login (UserLogin userLogin) throws LogInException;

    public String logout (String Key) throws LogInException;

}
