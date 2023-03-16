package com.phamhieu.bookapi.api.book;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public abstract class AbstractControllerTest {

    public ResultActions performGetRequest(final MockMvc mvc, final String url) throws Exception {
        return mvc.perform(MockMvcRequestBuilders.get(url).contentType(MediaType.APPLICATION_JSON));
    }

    public ResultActions performPostRequest(final MockMvc mvc, final String url, final String content) throws Exception {
        return mvc.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON).content(content));
    }

    public ResultActions performPutRequest(final MockMvc mvc, final String url, final String content) throws Exception {
        return mvc.perform(MockMvcRequestBuilders.put(url).contentType(MediaType.APPLICATION_JSON).content(content));
    }

    public ResultActions performDeleteRequest(final MockMvc mvc, final String url) throws Exception {
        return mvc.perform(MockMvcRequestBuilders.delete(url).contentType(MediaType.APPLICATION_JSON));
    }
}