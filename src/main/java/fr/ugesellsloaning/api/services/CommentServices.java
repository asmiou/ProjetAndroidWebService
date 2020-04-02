package fr.ugesellsloaning.api.services;

import fr.ugesellsloaning.api.entities.Borrow;
import fr.ugesellsloaning.api.entities.Comment;
import fr.ugesellsloaning.api.entities.Product;
import fr.ugesellsloaning.api.repositories.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServices {
    @Autowired
    private ICommentRepository commentRepository;

    public void save(Comment comment){ commentRepository.save(comment); }

    public Iterable<Comment> listComment(){ return commentRepository.findAll(); }

    public Optional<Comment> getCommentById(long id){
        return commentRepository.findById(id);
    }

    public void delete( Comment comment){ commentRepository.delete(comment); }

    public void deleteById(Long id){
        commentRepository.deleteById(id);
    }

    public List<Comment> getCommentByProduct(long product){
        return commentRepository.findCommentByProduct(product); }



}
