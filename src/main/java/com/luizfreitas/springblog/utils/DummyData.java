package com.luizfreitas.springblog.utils;

import com.luizfreitas.springblog.model.Post;
import com.luizfreitas.springblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Luiz");
        post1.setData(LocalDate.now());
        post1.setTitulo("Test");
        post1.setTexto("Lorem ipsum dolor sit amet consectetur adipiscing, elit faucibus ultrices augue duis dui, ac montes pretium praesent commodo. Torquent vulputate massa mattis consequat aenean arcu ridiculus, mauris vel netus condimentum nostra laoreet vitae vivamus, ante molestie nullam tortor curae fringilla. Non finibus dapibus habitant sodales blandit sit tortor maecenas, eros luctus nisi augue dui felis ante. Mattis netus libero vestibulum cursus tortor, tristique non in nostra augue ac, vel magna varius interdum. Platea proin quisque tincidunt cubilia feugiat sed ad fusce natoque posuere tortor, aptent id per suscipit massa dictum mauris placerat purus. Netus malesuada curabitur interdum imperdiet pretium dictumst, montes lorem gravida porta mi turpis suscipit, dui augue aptent et felis.");

        Post post2 = new Post();
        post2.setAutor("Luiz");
        post2.setData(LocalDate.now());
        post2.setTitulo("Test2");
        post2.setTexto("Eleifend scelerisque at pharetra suscipit interdum vivamus, mollis fermentum ullamcorper aenean iaculis magna rhoncus, lacinia sem quam congue vestibulum. Finibus justo auctor ut luctus sem litora dictumst urna vitae, dictum a facilisis duis magnis ridiculus diam aptent, taciti et platea sollicitudin quisque hac metus non. Cras pharetra posuere velit cubilia dui volutpat a quisque nulla lectus, primis consectetur condimentum torquent eleifend viverra per augue curae pellentesque, duis ut odio semper habitasse sollicitudin facilisis ex laoreet. Litora sit conubia arcu fusce sociosqu dictum adipiscing viverra aenean, ut pulvinar tristique cras iaculis imperdiet bibendum pharetra ligula facilisis, interdum auctor tellus dui volutpat donec sed lobortis. Augue habitasse nec ut quam iaculis interdum, donec pretium semper porttitor laoreet leo, lobortis nisl purus id fringilla.");

        postList.add(post1);
        postList.add(post2);

        for (Post post: postList){
            Post postSaved = blogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
