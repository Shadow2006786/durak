| method | path | description |
| ------ | ---- | ---------- |
| GET | /games | all games |
| GET | /games/{id} | game info |
| POST | /games | create game |
| GET | /players/games | get all player games history |
| POST | /games/{id}/deck | take new card |
| PUT | /games/{id}/turn | put card to desk |
```json
{
  "game": {
    "id": "id",
    "turn_user": "user id",
    "desk_cards": [],
    "hand_cards": [],
    "cards_left": 123,
    "opponent": {
      "user_id": 123,
      "hand_cards_left": 123
    }
  }
}
``` 

```json
{
  "history": {
    "game_id": "id",
    "turns": [
      {
        "user_active": "id",
        "user_passive": "id",
        "steps": [
          {
            "card": "",
            "card_attacked": ""
          }
        ]
      }
    ]
  }
}
```
