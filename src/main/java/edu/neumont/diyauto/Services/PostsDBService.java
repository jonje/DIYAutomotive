package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.CommentModel;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import java.util.List;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
public class PostsDBService implements PostsService
{
    @Override
    public List<PostModel> getAll(int ThreadID) {
        return null;
    }

    @Override
    public void AddPost(PostModel post) {

    }

    @Override
    public ThreadsModel getPost(int threadID, int postID) {
        return null;
    }

    @Override
    public void deleteComment(int threadID, int PostID, int CommentID) {

    }

    @Override
    public void addComment(int threadID, int PostID, CommentModel comment) {

    }
}
