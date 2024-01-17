package org.volaille.volaille_back;
import okhttp3.*;
import sendinblue.*;
import sendinblue.auth.*;
import sibModel.*;
import sibApi.AccountApi;

import java.io.File;
import java.io.IOException;
import java.util.*;
import sendinblue.ApiClient;
import sendinblue.Configuration;
import sendinblue.auth.ApiKeyAuth;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class mail {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"sender\":{\"name\":\"Volaille\",\"email\":\"noreply@bounceb.arthurd.fr\"},\"replyTo\":{\"email\":\"noreply@bounceb.arthurd.fr\",\"name\":\"No Reply\"},\"params\":{\"newKey\":\"New Value\"},\"to\":[{\"email\":\"french.driver49@gmail.com\",\"name\":\"French Driver\"}],\"textContent\":\"hello\",\"subject\":\"Test\"}");
        Request request = new Request.Builder()
                .url("https://api.brevo.com/v3/smtp/email")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("api-key", "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")
                .build();

        Response response = client.newCall(request).execute();
    }
}
