package org.ootb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jiazhao on 2/23/18.
 */

@Service
public class MsgClientService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendMessage(String message){
        RequestEntity<String> requst = new RequestEntity<String>(message);

    }
}
