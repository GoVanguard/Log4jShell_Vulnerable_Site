#!/bin/bash

ps aux | grep log4jBroke | grep java | grep -v grep | awk '{print $2}' | xargs kill -9  > /dev/null
