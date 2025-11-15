package com.india.womansafety_2024.user.SendNotificationPack;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA3pvrKpQ:APA91bHFK9YSTx83Mi5zJCkCWO5XVjPn9lUZlrdJvrUuzfFInSyWALI98QCcvrkqPz_gRxvrjVOatF8e3MtG940g7t_xtMZCRS71pqiUiuAJvGVgAeUbglCY8oPgk_n7vTlaQ1JGcd3c"

                    // get server key move FB console Project settings Cloud Messaging Server key
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifcation(@Body NotificationSender body);
}

