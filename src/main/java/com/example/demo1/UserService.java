package com.example.demo1;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author ：LiuJianhua
 * @date ：Created in 2020/9/17 15:05
 * @description :
 */
@Service
public class UserService
{
    private final UserRepository repository;

    public UserService(UserRepository repository)
    {
        this.repository = repository;
    }

    public List<UserEntity> getAll()
    {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://localhost:8081/api/user/all")
                .method("GET", null)
                .build();
        try
        {
            Response response = client.newCall(request).execute();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return repository.findAll();
    }

    public void save(UserEntity user)
    {
        repository.save(user);
    }
}
