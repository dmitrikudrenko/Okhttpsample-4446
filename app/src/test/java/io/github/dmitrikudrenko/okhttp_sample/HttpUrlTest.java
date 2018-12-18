package io.github.dmitrikudrenko.okhttp_sample;

import okhttp3.HttpUrl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class HttpUrlTest {
    @Test
    public void shouldCreateRequest() {
        final HttpUrl baseUrl = HttpUrl.parse("http://example.com");
        final HttpUrl url = baseUrl.newBuilder().addPathSegments("<>.,\\|*/1.jpg").build();
        Assert.assertEquals("http://example.com/%3C%3E.,%5C%7C*/1.jpg", url.toString());
    }
}
