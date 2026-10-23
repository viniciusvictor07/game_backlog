package com.vinicius.gamebacklog;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/games")
public class GameController {

    private GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @PostMapping
    public Game addGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game updatedGame) {
        Game game = gameRepository.findById(id).orElse(null);

        if (game != null) {
            game.setTitle(updatedGame.getTitle());
            game.setPlatform(updatedGame.getPlatform());
            game.setStatus(updatedGame.getStatus());
            game.setRating(updatedGame.getRating());
            game.setReview(updatedGame.getReview());
            game.setPlaytime(updatedGame.getPlaytime());
            return gameRepository.save(game);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameRepository.deleteById(id);
    }
}