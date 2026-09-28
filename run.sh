#!/bin/bash
# Compila e executa os exemplos da atividade.
# Uso: ./run.sh <classe>   ex.: ./run.sh q1f.Race   |   ./run.sh q2a.Deposito
# Os exemplos da Questão 1 (b, c, d, e) têm while(true): encerre com Ctrl+C.
cd "$(dirname "$0")"
mkdir -p out
javac -encoding UTF-8 -d out $(find src -name "*.java") || exit 1
java -cp out "$@"
