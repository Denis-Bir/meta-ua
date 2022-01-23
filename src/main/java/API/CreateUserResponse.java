package API;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonFormat;
import io.qameta.allure.internal.shadowed.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

public class CreateUserResponse {

    private String name;
    private String job;
    private int id;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd`T`hh:mm:ss.SSS`Z`")
    @JsonDeserialize(using = Deserializer.class)
    private LocalDateTime createdAt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }




}
