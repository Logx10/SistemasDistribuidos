# Atividade sobre Processos e Threads — Sistemas Distribuídos (IFCE Tianguá)

Implementação em Java das Questões 1, 2 e 3 da atividade de Processos e Threads.

## Estrutura

| Pacote | Conteúdo |
|---|---|
| `src/q1b` | Racer nas duas formas: `extends Thread` e `implements Runnable` |
| `src/q1c` | Race com 10 racers em `while (true)` |
| `src/q1d` | Racers com `Thread.sleep(100)` |
| `src/q1e` | Racers com `setPriority` (prioridade = id) |
| `src/q1f` | Racers com 1000 impressões; pares largam após os ímpares (`join`) |
| `src/q2a` | Deposito do enunciado + Produtor e Consumidor (sem controle) |
| `src/q2c` | Deposito que só retira se `items > 0` (`synchronized`) |
| `src/q3`  | Consumidor que espera 200 ms e tenta de novo |

- `saidas/` — saídas completas das execuções usadas no relatório
- `capturas/` — capturas das execuções e diagrama de classes
- `relatorio/` — relatório técnico (.docx)

## Como executar

Requer JDK 8+ (testado com OpenJDK 21).

```bash
./run.sh q1f.Race
./run.sh q2a.Deposito
./run.sh q3.Deposito
```

Os exemplos `q1b`, `q1c`, `q1d` e `q1e` rodam para sempre (`while (true)`): encerre com `Ctrl+C`.
